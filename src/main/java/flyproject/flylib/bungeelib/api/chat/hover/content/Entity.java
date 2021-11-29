package flyproject.flylib.bungeelib.api.chat.hover.content;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;
import flyproject.flylib.bungeelib.api.chat.BaseComponent;
import flyproject.flylib.bungeelib.api.chat.HoverEvent;
import flyproject.flylib.bungeelib.api.chat.hover.content.Content;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
public class Entity extends Content
{

    /**
     * Namespaced entity ID.
     *
     * Will use 'minecraft:pig' if null.
     */
    private String type;
    /**
     * Entity UUID in hyphenated hexadecimal format.
     *
     * Should be valid UUID. TODO : validate?
     */
    @NonNull
    private String id;
    /**
     * Name to display as the entity.
     *
     * This is optional and will be hidden if null.
     */
    private BaseComponent name;

    @Override
    public HoverEvent.Action requiredAction()
    {
        return HoverEvent.Action.SHOW_ENTITY;
    }
}
